package org.jbpm.examples.purchases;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Purchase Order Header")
public class PurchaseOrderHeader  implements java.io.Serializable {

static final long serialVersionUID = 1L;

    @org.kie.api.definition.type.Label(value = "Project")
    private java.lang.String project;

    @org.kie.api.definition.type.Label(value = "Creation Date")
    private java.util.Date creationDate;

    @org.kie.api.definition.type.Label(value = "Customer Name")
    private java.lang.String customer;

    @org.kie.api.definition.type.Label(value = "id")
    private java.lang.Long id;

    public PurchaseOrderHeader() {

    }

    public java.lang.String getProject() {
        return this.project;
    }

    public void setProject(  java.lang.String project ) {
        this.project = project;
    }

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(  java.util.Date creationDate ) {
        this.creationDate = creationDate;
    }

    public java.lang.String getCustomer() {
        return this.customer;
    }

    public void setCustomer(  java.lang.String customer ) {
        this.customer = customer;
    }

    public java.lang.String getId() {
        return this.customer;
    }

    public void setId( java.lang.Long id ) {
        this.id = id;
    }


}