package blankthings.bs.data.interactors;

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

    public PostInteractor(MainPresenter mainPresenter) {
        this.mainPresenter = mainPresenter;
    }

    public void getPosts() {
        final Disposable disposable = apiService.posts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(posts -> mainPresenter.setPosts(posts),
                        throwable -> mainPresenter.handleError(throwable));

        compositeDisposable.add(disposable);
    }

}
