package blankthings.bs.data.interactors;

import java.util.ArrayList;
import java.util.List;

import blankthings.bs.data.local.doa.PostDao;
import blankthings.bs.data.models.Post;
import blankthings.bs.ui.presenters.MainPresenter;

/**
 * Created by iosif on 9/26/17.
 */

public class PostInteractor extends BaseInteractor {

    public static final String TAG = PostInteractor.class.getSimpleName();

    private MainPresenter presenter;
    private PostDao postDao;


    public PostInteractor(MainPresenter presenter, PostDao postDao) {
        this.presenter = presenter;
        this.postDao = postDao;
    }


    public void getPosts() {
        presenter.setPosts(new ArrayList<Post>() {{{
            add(new Post() {{setId("1"); setTitle("Post one"); setBody("bod 1");}});
            add(new Post() {{setId("2"); setTitle("Post two"); setBody("bod two");}});
            add(new Post() {{setId("3"); setTitle("Post three"); setBody("bod three");}});
            add(new Post() {{setId("4"); setTitle("Post four"); setBody("bod four");}});
            add(new Post() {{setId("5"); setTitle("Post five"); setBody("bod five");}});
            add(new Post() {{setId("6"); setTitle("Post six"); setBody("bod six");}});
            add(new Post() {{setId("7"); setTitle("Post seven"); setBody("bod seven");}});
            add(new Post() {{setId("8"); setTitle("Post eight"); setBody("bod eight");}});
            add(new Post() {{setId("9"); setTitle("Post nine"); setBody("bod nine");}});
            }}});

//        final Disposable localDisposable = postDao.getAll()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(localPosts -> mainPresenter.setPosts(localPosts),
//                        localThrow -> mainPresenter.handleError(localThrow));
//
//        final Disposable disposable = apiService.posts()
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(posts -> {
//                        savePosts(posts);
//                        mainPresenter.setPosts(posts);
//                    },
//                    throwable -> mainPresenter.handleError(throwable));
//
//        compositeDisposable.add(localDisposable);
//        compositeDisposable.add(disposable);
    }


    public void savePosts(final List<Post> posts) {
        new Runnable() {
            @Override
            public void run() {
                postDao.insertAll(posts);
            }
        };
    }

}
