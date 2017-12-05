package blankthings.bs.data.interactors;

import org.web3j.protocol.Web3j;

import blankthings.bs.data.remote.ApiBuilder;
import blankthings.bs.ui.presenters.MainPresenter;
import rx.Subscription;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class EthInteractor extends BaseInteractor {

    private MainPresenter mainPresenter;

    private Web3j web3j;

    private CompositeSubscription compositeSubscription;

    public EthInteractor(MainPresenter presenter) {
        mainPresenter = presenter;
        web3j = new ApiBuilder().generateBlockchainClient();
        compositeSubscription = new CompositeSubscription();
    }


    public void fetchLatestTransactions() {
        final Subscription subscription = web3j
                .transactionObservable()
                .subscribeOn(Schedulers.io())
                .subscribe(tx -> mainPresenter.receivedTransaction(tx),
                    err -> mainPresenter.failedTransaction(err));

        compositeSubscription.add(subscription);
    }

}
