/*******************************************************************************
 * BBC News Reader
 * Released under the BSD License. See README or LICENSE.
 * Copyright (c) 2011, Digital Lizard (Oscar Key, Thomas Boby)
 * All rights reserved.
 ******************************************************************************/
package org.mcsoxford.rss;

/**
 * Contingency exception raised when RSS feeds could not be retrieved.
 * 
 * @author Mr Horn
 */
public class RSSReaderException extends RSSException {

  /**
   * Unsupported serialization
   */
  private static final long serialVersionUID = 1L;

  private final int status;

  public RSSReaderException(int status, String message) {
    super(message);
    this.status = status;
  }

  public RSSReaderException(int status, Throwable cause) {
    super(cause);
    this.status = status;
  }

  public RSSReaderException(int status, String message, Throwable cause) {
    super(message, cause);
    this.status = status;
  }

  /**
   * Return the HTTP status which caused the error.
   * 
   * @return HTTP error status code
   */
  public int getStatus() {
    return status;
  }
}