package com.fr.design.event;import java.util.EventListener;/** * Created by IntelliJ IDEA. * Author : Richer * Version: 7.0.3 * Date: 12-12-28 * Time: 下午8:24 */public interface ChangeListener extends EventListener {	public void fireChanged(ChangeEvent event);}