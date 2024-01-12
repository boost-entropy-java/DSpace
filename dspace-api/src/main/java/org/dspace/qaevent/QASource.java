/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.qaevent;

import java.util.Date;
import java.util.UUID;

/**
 * This model class represent the source/provider of the QA events (as Openaire).
 * 
 * @author Luca Giamminonni (luca.giamminonni at 4Science)
 *
 */
public class QASource {
    private String name;

    /**
     * if the QASource stats (see next attributes) are related to a specific target
     */
    private UUID focus;

    private long totalEvents;

    private Date lastEvent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getFocus() {
        return focus;
    }

    public void setFocus(UUID focus) {
        this.focus = focus;
    }

    public long getTotalEvents() {
        return totalEvents;
    }

    public void setTotalEvents(long totalEvents) {
        this.totalEvents = totalEvents;
    }

    public Date getLastEvent() {
        return lastEvent;
    }

    public void setLastEvent(Date lastEvent) {
        this.lastEvent = lastEvent;
    }

    @Override
    public String toString() {
        return name + focus + totalEvents;
    }
}
