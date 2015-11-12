package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareError extends Exception {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    public CloudflareError(String flag, String globalMessage, String message) {
        super("[" + flag + "] : " + globalMessage + " :: " + message);
    }
}
