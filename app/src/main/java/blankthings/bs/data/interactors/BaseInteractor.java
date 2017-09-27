package blankthings.bs.data.interactors;

import blankthings.bs.data.ApiBuilder;
import blankthings.bs.data.ApiService;

/**
 * Created by iosif on 9/26/17.
 */

public class BaseInteractor {

    protected final ApiService apiService;

    public BaseInteractor() {
        ApiBuilder apiBuilder = new ApiBuilder();
        apiService = apiBuilder.getApiService();

    }

}
