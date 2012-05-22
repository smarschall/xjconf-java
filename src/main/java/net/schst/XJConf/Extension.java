package net.schst.XJConf;

import net.schst.XJConf.exceptions.XJConfException;


/**
 * Interface for XJConf Extensions
 * 
 * @author Stephan Schmidt <stephan.schmidt@schlund.de>
 */
public interface Extension {
    
	/**
	 * Get the namespace URI used by the extension
	 * 
	 * @return
	 */
    public String getNamespace();
    
    /**
     * Process a start element
     * 
     * @param reader
     * @param tag
     * @param loader TODO
     * @throws XJConfException
     */
    public void startElement(XmlReader reader, Tag tag, ClassLoader loader)
        throws XJConfException;

    /**
     * Process the end element
     * 
     * @param reader
     * @param tag
     * @param loader TODO
     * @throws XJConfException
     */
    public Tag endElement(XmlReader reader, Tag tag, ClassLoader loader)
        throws XJConfException;   
    }