/*******************************************************************************
 * 	Copyright (c) 2011, The Dojo Foundation All Rights Reserved.
 * 	Available via Academic Free License >= 2.1 OR the modified BSD license.
 * 	see: http://dojotoolkit.org/license for details
 *******************************************************************************/
package org.dojoserverfaces.behavior.html;

import org.dojoserverfaces.build.annotation.Behavior;

/**
 * This behavior will allow you the invoke upload method of dojox.form.Uploader.
 */
@Behavior
public class Upload extends SimpleMethodBase {

    public Upload() {
        super("upload");
    }

}