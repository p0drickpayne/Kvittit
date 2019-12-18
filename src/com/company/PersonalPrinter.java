package com.company;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.awt.print.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PersonalPrinter extends PrinterJob  {
    @Override
    public void setPrintable(Printable painter) {

    }

    @Override
    public void setPrintable(Printable painter, PageFormat format) {

    }

    @Override
    public void setPageable(Pageable document) throws NullPointerException {

    }

    @Override
    public boolean printDialog() throws HeadlessException {
        return false;
    }

    @Override
    public PageFormat pageDialog(PageFormat page) throws HeadlessException {
        return null;
    }

    @Override
    public PageFormat defaultPage(PageFormat page) {
        return null;
    }

    @Override
    public PageFormat validatePage(PageFormat page) {
        return null;
    }

    @Override
    public void print() throws PrinterException {

    }

    @Override
    public void setCopies(int copies) {

    }

    @Override
    public int getCopies() {
        return 0;
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public void setJobName(String jobName) {

    }

    @Override
    public String getJobName() {
        return null;
    }

    @Override
    public void cancel() {

    }

    @Override
    public boolean isCancelled() {
        return false;
    }
}
