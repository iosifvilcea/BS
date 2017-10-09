package blankthings.bs.data.interactors;

import java.util.List;

import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.data.models.Post;
import blankthings.bs.ui.presenters.MainPresenter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by iosif on 9/26/17.
 */

public class PostInteractor extends BaseInteractor {

    public static final String TAG = PostInteractor.class.getSimpleName();

    private MainPresenter mainPresenter;

    private PostDao postDao;

    public PostInteractor(MainPresenter mainPresenter, PostDao postDao) {
        this.mainPresenter = mainPresenter;
        this.postDao = postDao;
    }

    public void getPosts() {
        final Disposable localDisposable = postDao.getAll()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(localPosts -> mainPresenter.setPosts(localPosts),
                        localThrow -> mainPresenter.handleError(localThrow));

        final Disposable disposable = apiService.posts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(posts -> {
                        savePosts(posts);
                        mainPresenter.setPosts(posts);
                    },
                    throwable -> mainPresenter.handleError(throwable));

        compositeDisposable.add(localDisposable);
        compositeDisposable.add(disposable);
    }


    private void savePosts(final List<Post> posts) {
        new Runnable() {
            @Override
            public void run() {
                postDao.insertAll(posts);
            }
        };
    }

}
