package te.app.aljoud.pages.fawaterkPayment.models.check_out;

import te.app.aljoud.pages.fawaterkPayment.models.check_out.installment.CartInstallmentData;

public class PassingCheckoutData {
    private CheckoutRequest checkoutRequest;
    private CartInstallmentData cartInstallmentData;
    private int invoiceId;
    private String redirectTo;

    public CheckoutRequest getCheckoutRequest() {
        return checkoutRequest;
    }

    public void setCheckoutRequest(CheckoutRequest checkoutRequest) {
        this.checkoutRequest = checkoutRequest;
    }

    public CartInstallmentData getInstallmentData() {
        return cartInstallmentData;
    }

    public void setInstallmentData(CartInstallmentData cartInstallmentData) {
        this.cartInstallmentData = cartInstallmentData;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getRedirectTo() {
        return redirectTo;
    }

    public void setRedirectTo(String redirectTo) {
        this.redirectTo = redirectTo;
    }
}
