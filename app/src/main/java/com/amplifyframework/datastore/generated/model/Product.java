package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Product type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Products")
public final class Product implements Model {
  public static final QueryField ID = field("Product", "id");
  public static final QueryField NAME = field("Product", "name");
  public static final QueryField PARENT = field("Product", "parent");
  public static final QueryField DESCRIPTION = field("Product", "description");
  public static final QueryField COST = field("Product", "cost");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="String", isRequired = true) String parent;
  private final @ModelField(targetType="String", isRequired = true) String description;
  private final @ModelField(targetType="Float") Double cost;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public String getParent() {
      return parent;
  }
  
  public String getDescription() {
      return description;
  }
  
  public Double getCost() {
      return cost;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Product(String id, String name, String parent, String description, Double cost) {
    this.id = id;
    this.name = name;
    this.parent = parent;
    this.description = description;
    this.cost = cost;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Product product = (Product) obj;
      return ObjectsCompat.equals(getId(), product.getId()) &&
              ObjectsCompat.equals(getName(), product.getName()) &&
              ObjectsCompat.equals(getParent(), product.getParent()) &&
              ObjectsCompat.equals(getDescription(), product.getDescription()) &&
              ObjectsCompat.equals(getCost(), product.getCost()) &&
              ObjectsCompat.equals(getCreatedAt(), product.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), product.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getParent())
      .append(getDescription())
      .append(getCost())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Product {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("parent=" + String.valueOf(getParent()) + ", ")
      .append("description=" + String.valueOf(getDescription()) + ", ")
      .append("cost=" + String.valueOf(getCost()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static NameStep builder() {
      return new Builder();
  }
  
  /** 
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Product justId(String id) {
    return new Product(
      id,
      null,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      name,
      parent,
      description,
      cost);
  }
  public interface NameStep {
    ParentStep name(String name);
  }
  

  public interface ParentStep {
    DescriptionStep parent(String parent);
  }
  

  public interface DescriptionStep {
    BuildStep description(String description);
  }
  

  public interface BuildStep {
    Product build();
    BuildStep id(String id);
    BuildStep cost(Double cost);
  }
  

  public static class Builder implements NameStep, ParentStep, DescriptionStep, BuildStep {
    private String id;
    private String name;
    private String parent;
    private String description;
    private Double cost;
    @Override
     public Product build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Product(
          id,
          name,
          parent,
          description,
          cost);
    }
    
    @Override
     public ParentStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public DescriptionStep parent(String parent) {
        Objects.requireNonNull(parent);
        this.parent = parent;
        return this;
    }
    
    @Override
     public BuildStep description(String description) {
        Objects.requireNonNull(description);
        this.description = description;
        return this;
    }
    
    @Override
     public BuildStep cost(Double cost) {
        this.cost = cost;
        return this;
    }
    
    /** 
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String name, String parent, String description, Double cost) {
      super.id(id);
      super.name(name)
        .parent(parent)
        .description(description)
        .cost(cost);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder parent(String parent) {
      return (CopyOfBuilder) super.parent(parent);
    }
    
    @Override
     public CopyOfBuilder description(String description) {
      return (CopyOfBuilder) super.description(description);
    }
    
    @Override
     public CopyOfBuilder cost(Double cost) {
      return (CopyOfBuilder) super.cost(cost);
    }
  }
  
}
