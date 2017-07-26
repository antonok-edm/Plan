package main.java.com.djrapitops.plan.data.cache;

import main.java.com.djrapitops.plan.data.UserData;

/**
 * This abstract class can be extended with anything as the process method and
 * given to the Database.
 * <p>
 * The process method will be called with the UserData object fetched from the
 * database.
 *
 * @author Rsl1122
 * @since 2.6.0
 */
public abstract class DBCallableProcessor {

    /**
     * Method used to do multiple things to UserData objects such as Caching,
     * changing properties etc.
     *
     * @param data UserData object given to the DBCallableProcessor by the
     *             method it was given as parameter to.
     */
    public abstract void process(UserData data);
}
