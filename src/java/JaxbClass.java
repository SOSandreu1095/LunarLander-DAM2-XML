
import com.sun.org.apache.xml.internal.resolver.Catalog;
import generated.Configuraciones;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class JaxbClass {

    protected Configuraciones xmlToObject(File f) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Configuraciones.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            //Do the job, return object
            return (Configuraciones) jaxbUnmarshaller.unmarshal(f);
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }


    protected void objectToXml(Configuraciones cds, File rf) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Configuraciones.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Optional
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            //Do the job
            jaxbMarshaller.marshal(cds, rf);

            //Optional: output pretty printed
            //jaxbMarshaller.marshal(cds, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
