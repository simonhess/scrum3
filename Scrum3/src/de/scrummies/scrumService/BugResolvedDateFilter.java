
package de.scrummies.scrumService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BugResolvedDateFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BugResolvedDateFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fuldaai.de}BugDateRangeFilter">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BugResolvedDateFilter", namespace = "http://www.fuldaai.de")
public class BugResolvedDateFilter
    extends BugDateRangeFilter
{


}
