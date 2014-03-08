package applimedical.sighal.api.pojo;
/***********************************************************************
 * Module:  Intervenant.java
 * Author:  HAZEM
 * Purpose: Defines the Class Intervenant
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "intervenant")
public class Intervenant extends Personnel {
}