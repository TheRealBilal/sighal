package applimedical.sighal.api.pojo.tmp;
/***********************************************************************
 * Module:  Intervenant.java
 * Author:  HAZEM
 * Purpose: Defines the Class Intervenant
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

import applimedical.sighal.api.pojo.Personnel;

@Entity
@Table(name = "intervenant")
public class Intervenant extends Personnel {
}