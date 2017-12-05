package blankthings.bs.ui.presenters;

import org.web3j.protocol.core.methods.response.Transaction;

import blankthings.bs.data.interactors.EthInteractor;
import blankthings.bs.ui.base.BasePresenter;
import blankthings.bs.ui.views.MainView;
import io.reactivex.annotations.NonNull;


public class MainPresenterImpl extends BasePresenter<MainView> implements MainPresenter {

    private final EthInteractor interactor;

    public MainPresenterImpl(@NonNull final MainView view) {
        this.view = view;
        interactor = new EthInteractor(this);
    }


    @Override
    public void init() {
        super.init();
        fetchLatestTransactions();
    }


    @Override
    public void terminate() {
        super.terminate();
        interactor.cleanup();
    }


    @Override
    public void fetchLatestTransactions() {
        interactor.fetchLatestTransactions();
    }


    @Override
    public void receivedTransaction(Transaction transaction) {
        if (!hasView()) {
            return;
        }

        final String blockHash = transaction.getBlockHash();
        view.showLatestTransaction(blockHash);
    }


    @Override
    public void failedTransaction(Throwable throwable) {
        if (!hasView()) {
            return;
        }

        view.showError(throwable.getLocalizedMessage());
    }
}
