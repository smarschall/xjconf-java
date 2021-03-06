package net.schst.XJConf;

import net.schst.XJConf.exceptions.ValueConversionException;

/**
 * Interface for tag and attribute definitions.
 *
 * @author Stephan Schmidt <stephan.schmidt@schlund.de>
 */
public interface Definition {
    /**
     * Get the name under which the information
     * will be stored.
     *
     * @return  name of the value
     */
    String getName();

    /**
     * Get the converted value.
     *
     * XJConf will pass the complete tag to this method
     *
     * @param value
     * @param loader
     * @return
     * @throws ValueConversionException
     */
    Object convertValue(Tag tag, ClassLoader loader) throws ValueConversionException;

    /**
     * Get the type of the converted value.
     * @param tag TODO
     *
     * @return
     */
    Class<?> getValueType(Tag tag, ClassLoader loader);

    /**
     * Get the name of the setter method.
     *
     * @return
     */
    String getSetterMethod();

    /**
     * Add a child definition of any type.
     *
     * @param def
     */
    void addChildDefinition(Definition def) throws Exception;
}
