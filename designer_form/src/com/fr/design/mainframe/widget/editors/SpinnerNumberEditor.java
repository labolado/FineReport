package com.fr.design.mainframe.widget.editors;import com.fr.design.Exception.ValidationException;import com.fr.design.event.UIObserverListener;import com.fr.design.gui.ispinner.UIBasicSpinner;import com.fr.form.ui.NumberEditor;import javax.swing.*;import java.awt.*;/** * Author : Shockway * Date: 13-9-29 * Time: 上午10:32 */public class SpinnerNumberEditor extends AbstractPropertyEditor {	protected NumberEditor widget;	protected UIBasicSpinner spinner;	protected SpinnerNumberModel valueModel;	public SpinnerNumberEditor(Object o) {		this.widget = (NumberEditor) o;		this.valueModel = new SpinnerNumberModel(0D, -Double.MAX_VALUE , Double.MAX_VALUE, 1D);		this.spinner = new UIBasicSpinner(this.valueModel);        this.spinner.registerChangeListener(new UIObserverListener() {            @Override            public void doChange() {                SpinnerNumberEditor.this.firePropertyChanged();            }        });	}	protected Double getDefaultLimit() {		return Double.MAX_VALUE;	}	protected Double getLimitValue() {		return this.widget.getMaxValue();	}    /**     * 使值合规范     * @throws ValidationException     */	public void validateValue() throws ValidationException {	}	public void setValue(Object value) {		this.spinner.setValue(value);	}	public Object getValue() {		return this.spinner.getValue();	}	public Component getCustomEditor() {		return this.spinner;	}}