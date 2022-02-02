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

/** This is an auto generated class representing the Category type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Categories")
@Index(name = "byOrder", fields = {"parent","order"})
public final class Category implements Model {
  public static final QueryField ID = field("Category", "id");
  public static final QueryField NAME = field("Category", "name");
  public static final QueryField PARENT = field("Category", "parent");
  public static final QueryField ORDER = field("Category", "order");
  public static final QueryField LEAF_NODE = field("Category", "leaf_node");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="String", isRequired = true) String parent;
  private final @ModelField(targetType="Int") Integer order;
  private final @ModelField(targetType="Boolean") Boolean leaf_node;
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
  
  public Integer getOrder() {
      return order;
  }
  
  public Boolean getLeafNode() {
      return leaf_node;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Category(String id, String name, String parent, Integer order, Boolean leaf_node) {
    this.id = id;
    this.name = name;
    this.parent = parent;
    this.order = order;
    this.leaf_node = leaf_node;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Category category = (Category) obj;
      return ObjectsCompat.equals(getId(), category.getId()) &&
              ObjectsCompat.equals(getName(), category.getName()) &&
              ObjectsCompat.equals(getParent(), category.getParent()) &&
              ObjectsCompat.equals(getOrder(), category.getOrder()) &&
              ObjectsCompat.equals(getLeafNode(), category.getLeafNode()) &&
              ObjectsCompat.equals(getCreatedAt(), category.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), category.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getParent())
      .append(getOrder())
      .append(getLeafNode())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Category {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("parent=" + String.valueOf(getParent()) + ", ")
      .append("order=" + String.valueOf(getOrder()) + ", ")
      .append("leaf_node=" + String.valueOf(getLeafNode()) + ", ")
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
  public static Category justId(String id) {
    return new Category(
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
      order,
      leaf_node);
  }
  public interface NameStep {
    ParentStep name(String name);
  }
  

  public interface ParentStep {
    BuildStep parent(String parent);
  }
  

  public interface BuildStep {
    Category build();
    BuildStep id(String id);
    BuildStep order(Integer order);
    BuildStep leafNode(Boolean leafNode);
  }
  

  public static class Builder implements NameStep, ParentStep, BuildStep {
    private String id;
    private String name;
    private String parent;
    private Integer order;
    private Boolean leaf_node;
    @Override
     public Category build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Category(
          id,
          name,
          parent,
          order,
          leaf_node);
    }
    
    @Override
     public ParentStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep parent(String parent) {
        Objects.requireNonNull(parent);
        this.parent = parent;
        return this;
    }
    
    @Override
     public BuildStep order(Integer order) {
        this.order = order;
        return this;
    }
    
    @Override
     public BuildStep leafNode(Boolean leafNode) {
        this.leaf_node = leafNode;
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
    private CopyOfBuilder(String id, String name, String parent, Integer order, Boolean leafNode) {
      super.id(id);
      super.name(name)
        .parent(parent)
        .order(order)
        .leafNode(leafNode);
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
     public CopyOfBuilder order(Integer order) {
      return (CopyOfBuilder) super.order(order);
    }
    
    @Override
     public CopyOfBuilder leafNode(Boolean leafNode) {
      return (CopyOfBuilder) super.leafNode(leafNode);
    }
  }
  
}
