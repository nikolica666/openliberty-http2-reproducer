package hr.nipeta;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class PdfBean implements Serializable {

    private String selectedObject;

}