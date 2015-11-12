package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareUnauthError extends CloudflareError {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    public CloudflareUnauthError(String flag, String globalMessage, String message) {
        super(flag, globalMessage, message);
    }
}
