package blankthings.cryptocap.managers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import blankthings.cryptocap.R;
import blankthings.cryptocap.ui.base.BaseFragment;
import blankthings.cryptocap.ui.base.BaseView;


public class NavigationManager {

    private AppCompatActivity activity;
    private BaseView baseView;

    public NavigationManager(final AppCompatActivity mainActivity) {
        activity = mainActivity;
    }


    private void ensureValidFragment(final Fragment fragment) {
        if (!(fragment instanceof BaseFragment)) {
            throw new IllegalArgumentException("Fragment is not an instance of BaseFragment.");
        }
    }


    private void changeFragment(final Fragment fragment, final String tag, final boolean replace) {
        ensureValidFragment(fragment);

        final FragmentManager manager = activity.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        if (replace) {
            transaction.replace(R.id.content_main, fragment, tag);
        } else {
            transaction.add(R.id.content_main, fragment, tag);
        }

        transaction.addToBackStack(tag);
        transaction.commit();
    }


    public boolean goBack() {
        final FragmentManager fragmentManager = activity.getSupportFragmentManager();
        boolean backPressHandled = isHandledByFragment();

        if (!backPressHandled) {
            if (fragmentManager.getBackStackEntryCount() > 1) {
                fragmentManager.popBackStackImmediate();
                backPressHandled = true;
            } else {
                fragmentManager.popBackStackImmediate();
                backPressHandled = false;
            }
        }

        return backPressHandled;
    }


    public void goBackToFragment(final String tag) {
        final FragmentManager fragmentManager = activity.getSupportFragmentManager();
        fragmentManager.popBackStack(tag, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }


    private boolean isHandledByFragment() {
        final FragmentManager fragmentManager = activity.getSupportFragmentManager();
        boolean backPressHandled = false;

        /** Notifies visible fragment of backpress. */
        final Fragment fragment = fragmentManager.findFragmentById(R.id.content_main);
        if (fragment != null && fragment instanceof OnBackPressedListener) {
            backPressHandled = ((OnBackPressedListener) fragment).onBackPressed();
        }

        return backPressHandled;
    }


//    @Override
//    public void startLoading() {
//        crossfadeLoading(true);
//    }
//
//
//    @Override
//    public void stopLoading() {
//        crossfadeLoading(false);
//    }
//
//
//    private void crossfadeLoading(boolean startLoading) {
//        int loadingAnimDuration = 400;
//        final float startAlpha, endingAlpha;
//        final int stopVisibility;
//        if (startLoading) {
//            startAlpha = 0f;
//            endingAlpha = 1f;
//            stopVisibility = View.VISIBLE;
//        } else {
//            startAlpha = 1f;
//            endingAlpha = 0f;
//            stopVisibility = View.GONE;
//        }
//
//        loadingView.setAlpha(startAlpha);
//        loadingView.setVisibility(View.VISIBLE);
//
//        loadingView.animate()
//                .alpha(endingAlpha)
//                .setDuration(loadingAnimDuration)
//                .setListener(new AnimatorListenerAdapter() {
//                    @Override
//                    public void onAnimationEnd(Animator animation) {
//                        loadingView.setVisibility(stopVisibility);
//                    }
//                });
//    }


    /**
     * Notifies subscribers of back navigation.
     */
    public interface OnBackPressedListener {
        boolean onBackPressed();
    }

}