// Gabriel Kiewietz
// 230990703
// 18 May 2024
//nnn2
package za.co.hireahelper.domain;

import jakarta.persistence.*;

@Entity
public class ServiceType {

    @Id
    private String typeId;
    private String typeName;


    protected ServiceType() {}

    private ServiceType(Builder builder) {
        this.typeId = builder.typeId;
        this.typeName = builder.typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getTypeName() {
        return typeName;
    }


    @Override
    public String toString() {
        return "ServiceType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public String getDescription() {

    return typeId;}

    public static class Builder {
        private String typeId;
        private String typeName;

        public Builder setTypeId(String typeId) {
            this.typeId = typeId;
            return this;
        }

        public Builder setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }

        public Builder copy(ServiceType serviceType) {
            this.typeId = serviceType.typeId;
            this.typeName = serviceType.typeName;
            return this;
        }

        public ServiceType build() {
            return new ServiceType(this);
        }

        public Builder setDescription() {
            return null;
        }
    }
}
