package org.anshuahi.SpringBlog.utils.constants;

public enum Authorities {

    RESET_ANY_USER_PASSWORD(1, "RESET_ANY_USER_PASSWORD"),
    ACCESS_ADMIN_PANEL(2, "ACCESS_ADMIN_PANEL");

    private int authorityId;
    private String authorityString;

    private Authorities(int authorityId, String authorityString) {
        this.authorityId = authorityId;
        this.authorityString = authorityString;
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public String getAuthorityString() {
        return authorityString;
    }

}
