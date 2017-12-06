package blankthings.cryptocap.data.interactors;

import blankthings.cryptocap.data.remote.ApiBuilder;
import blankthings.cryptocap.data.remote.ApiService;
import io.reactivex.disposables.CompositeDisposable;


public abstract class BaseInteractor {

    protected final ApiService apiService;

    protected CompositeDisposable compositeDisposable;

    public BaseInteractor() {
        final ApiBuilder apiBuilder = new ApiBuilder();
        apiService = apiBuilder.getApiService();

        compositeDisposable = new CompositeDisposable();
    }

    public void cleanup() {
        compositeDisposable.clear();
    }

}
