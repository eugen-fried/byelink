package com.byelink.web.persistence.dao;

/**
 * @author Yoav
 * @since 2/16/13
 */
public class ByeLinkDaoException extends RuntimeException {
    public ByeLinkDaoException(String message, Exception cause, Object... args) {
        super(String.format(message, args), cause);
    }
}
