package blankthings.bs.ui.presenters;

import org.web3j.protocol.core.methods.response.Transaction;

public interface MainPresenter {

    void fetchLatestTransactions();

    void receivedTransaction(final Transaction transaction);

}
