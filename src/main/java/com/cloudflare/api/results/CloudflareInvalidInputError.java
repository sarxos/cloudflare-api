package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareInvalidInputError extends CloudflareError {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    public CloudflareInvalidInputError(String flag, String globalMessage, String message) {
        super(flag, globalMessage, message);
    }
}
