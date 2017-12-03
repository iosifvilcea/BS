package blankthings.bs.data.interactors;

import blankthings.bs.data.remote.ApiBuilder;
import blankthings.bs.data.remote.ApiService;
import io.reactivex.disposables.CompositeDisposable;


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
