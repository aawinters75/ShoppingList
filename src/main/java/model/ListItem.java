/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 31, 2022
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ListItem {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the store
	 */
	public String getStore() {
		return store;
	}


	/**
	 * @param store the store to set
	 */
	public void setStore(String store) {
		this.store = store;
	}


	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}


	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	
	
	public ListItem() {
		super();
	}
	
	public	ListItem(String	store,	String	item){
		super();
		this.store	=	store;
		this.item	=	item;
		}
	
	public String returnItemDetails(	)	{
		return	this.store	+	":	"	+	this.item;
		}
}

