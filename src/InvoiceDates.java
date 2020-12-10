
public class InvoiceDates {
    private Date _dateInvoice;
    private Date _dateSale;

    public void setDateInvoice(Date dateInvoice) {
        _dateInvoice = dateInvoice;
    }

    public void setDateSale(Date dateSale) {
        _dateSale = dateSale;
    }

    public Date getDateInvoice() {
        return _dateInvoice;
    }

    public Date getDateSale() {
        return _dateSale;
    }

    public String toString() {
        return new String("\tInvoice date: " + _dateInvoice + "\n\tSale date: " + _dateSale);
    }
}
