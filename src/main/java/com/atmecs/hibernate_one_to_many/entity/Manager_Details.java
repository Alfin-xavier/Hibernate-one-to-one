package com.atmecs.hibernate_one_to_many.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "manager_details")
public class Manager_Details 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
    @Column(name = "m_id")
    private int m_id;
 
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	@JoinColumn(name = "p_id", referencedColumnName = "p_id")
	private Project_Details proj_det;
	
    @Column(name = "m_name")
    private String m_name;
 
    @Column(name = "m_email")
    private String m_email;
 
    @Column(name = "p_id")
    private int p_id;
    
    public void setManagerDetails(Project_Details proj_det2)
    {
    	
    }
    
	public Manager_Details(int m_id,String m_name, String m_email,int p_id)
	{
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_email = m_email;
		this.p_id = p_id;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}

	public int getM_id() 
	{
		return m_id;
	}
	
	public void setM_id(int m_id) 
	{
		this.m_id = m_id;
	}

	public String getM_name() 
	{
		return m_name;
	}

	public void setM_name(String m_name) 
	{
		this.m_name = m_name;
	}

	public String getM_email()
	{
		return m_email;
	}

	public void setM_email(String m_email)
	{
		this.m_email = m_email;
	}

	public int getP_id() 
	{
		return p_id;
	}

	public void setP_name(int p_id) 
	{
		this.p_id = p_id;
	}
    
    
}
