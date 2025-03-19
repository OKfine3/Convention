package edu.ustb.crypto.convention.checkProxy;

import edu.ustb.crypto.convention.compile.entity.*;

public interface ClauseInterface<T extends Term, C extends Clause> {
    public boolean preHandle(T term, C clause);

    public boolean postHandle(T term, C clause);

    public boolean process(T term, C clause);
}


