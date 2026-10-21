module com.telusko.learning.module {
    requires jakarta.ws.rs;

    requires org.glassfish.jersey.container.servlet;
    requires org.glassfish.jersey.inject.hk2;
    requires org.glassfish.jersey.media.jaxb;
    requires jakarta.xml.bind;
    requires org.glassfish.jaxb.runtime;
    requires java.sql;
    requires mysql.connector.j;

    exports com.telusko.learning;
}