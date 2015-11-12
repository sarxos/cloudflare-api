package com.cloudflare.api.results;

/**
 *
 * @author LoadLow
 */
public class CloudflareMaxRequestsError extends CloudflareError {

    /**
     * Serial.
     */
    private static final long serialVersionUID = 1L;

    public CloudflareMaxRequestsError(String flag, String globalMessage, String message) {
        super(flag, globalMessage, message);
    }
}
