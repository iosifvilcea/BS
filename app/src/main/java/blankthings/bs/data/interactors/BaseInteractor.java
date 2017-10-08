package blankthings.bs.data.interactors;

import blankthings.bs.data.ApiBuilder;
import blankthings.bs.data.ApiService;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by iosif on 9/26/17.
 */

public abstract class BaseInteractor {

    protected final ApiService apiService;

    protected CompositeDisposable compositeDisposable;

    public BaseInteractor() {
        ApiBuilder apiBuilder = new ApiBuilder();
        apiService = apiBuilder.getApiService();

        compositeDisposable = new CompositeDisposable();
    }

    public void cleanup() {
        compositeDisposable.clear();
    }

}
