package com.indeed.status.core;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 *
 * @author matts
 */
public interface StatusUpdateListener {
    /**
     * Triggered when the status of a dependency has changed.
     *
     * @param source The dependency which had its status changed.
     * @param original The previous result.
     * @param updated The new, changed result.
     */
    void onChanged(
            @Nonnull final Dependency source,
            @Nullable final CheckResult original,
            @Nonnull final CheckResult updated
    );

    /**
     * Triggered each and every time the status of a dependency is checked.
     *
     * @param source The dependency which was checked.
     * @param result The result of the check.
     */
    void onChecked(
            @Nonnull final Dependency source,
            @Nonnull final CheckResult result
    );

    /**
     * Triggered when a new dependency is added
     *
     * @param dependency The dependency being added.
     */
    void onAdded(@Nonnull final Dependency dependency);
}
