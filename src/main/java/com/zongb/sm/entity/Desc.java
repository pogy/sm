package com.zongb.sm.entity;

/**
 * 产品html描述组成类
 * @author zongb
 *
 */
public class Desc {

	private String fashion ;
	private String itemType ;
	private String isCustomized ;

	private String style ;
	private String size ;
	private String gender ;
	private String braceletType ;
	private String brandName ;
	private String length ;
	private String diameter ;
	private String shapeOrPattern ;
	private String modelNumber ;
	private String mainMaterial ;

	private String otherHtml ;
	
	public  Desc(){
		fashion = "Fashion" ;
		itemType = "&nbsp;" ;
		isCustomized = "Yes" ;
		style = "&nbsp;" ;
		gender = "Unisex" ;
		braceletType = "&nbsp;" ;
		brandName = "Zz beads" ;
		diameter = "&nbsp;" ;
		shapeOrPattern = "&nbsp;" ;

		mainMaterial = "&nbsp;" ;
	}
	
	@Override
	public String toString() {
		StringBuilder temp = new StringBuilder("");  
		
		temp.append("<div class=\"params\"  style=\"color: rgb(0, 0, 0); font-size: 11.8px; word-wrap: break-word; padding: 15px 10px; font-family: verdana; line-height: 10.9px;\">") ;
		//temp.append("<h2 style=\"color: rgb(51, 51, 51); font-size: 16px; margin: 0px; padding: 0px 0px 5px; font-family: Arial;\">Item specifics</h2>") ;

		if(null != brandName){
			temp.append(wrapItemHtml("Brand Name:",this.brandName)) ;
		}
		if(null != modelNumber){
			temp.append(wrapItemHtml("Model Number:",this.modelNumber)) ;
		}
		if(null != shapeOrPattern){
			temp.append(wrapItemHtml("Shape/pattern:",this.shapeOrPattern)) ;
		}
		if(null != length){
			temp.append(wrapItemHtml("Length:",this.length)) ;
		}
		if(null != diameter){
			temp.append(wrapItemHtml("Diameter:",this.diameter)) ;
		}
		
		if(null != fashion){
			temp.append(wrapItemHtml("Fine or Fashion:",this.fashion)) ;
		}
		if(null != itemType){
			temp.append(wrapItemHtml("Item Type:",this.itemType)) ;
		}
		if(null != isCustomized){
			temp.append(wrapItemHtml("is_customized:",this.isCustomized)) ;
		}
		if(null != style){
			temp.append(wrapItemHtml("Style:",this.style)) ;
		}
		if(null != size){
			temp.append(wrapItemHtml("Size:",this.size)) ;
		}
		if(null != gender){
			temp.append(wrapItemHtml("Gender:",this.gender)) ;
		}
		if(null != braceletType){
			temp.append(wrapItemHtml("Bracelet Type:",this.braceletType)) ;
		}
		if(null != mainMaterial){
			temp.append(wrapItemHtml("Main Material:",this.mainMaterial)) ;
		}
		
		temp.append("</div>") ;
		
		//其他html信息
		temp.append(this.otherHtml) ;
		
		
		return temp.toString() ;
	}
	
	/**
	 * 包装一个key value成一个html
	 * @param key
	 * @param value
	 * @return
	 */
	private String wrapItemHtml(String key,String value){
		return "<dl style=\"padding-top: 5px; padding-right: 0px; padding-left: 0px; margin: 0px;\">"
				+ wrapKeyHtml(key)
				+ wrapValueHtml(value)
				+ "</dl>" ;
	}
	
	/**
	 * 包装一个key
	 * @param key
	 * @return
	 */
	private String wrapKeyHtml(String key){
		return "<dt style=\"margin: 0px; padding: 3px 0px 0px; float: left; width: 200px; font-weight: 700; text-align: right;\">"
				+ "【" + key + "】</dt>" ;
	}
	/**
	 * 包装一个value
	 * @param value
	 * @return
	 */
	private String wrapValueHtml(String value){
		return "<dd style=\"margin: 0px 0px 0px 208px; padding: 0px; line-height: 16.3px;\">"
				+ value + "</dd>" ;
	}
	

	public String getOtherHtml() {
		return otherHtml;
	}

	public void setOtherHtml(String otherHtml) {
		this.otherHtml = otherHtml;
	}

	public String getFashion() {
		return fashion;
	}

	public void setFashion(String fashion) {
		this.fashion = fashion;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getIsCustomized() {
		return isCustomized;
	}

	public void setIsCustomized(String isCustomized) {
		this.isCustomized = isCustomized;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBraceletType() {
		return braceletType;
	}

	public void setBraceletType(String braceletType) {
		this.braceletType = braceletType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public String getShapeOrPattern() {
		return shapeOrPattern;
	}

	public void setShapeOrPattern(String shapeOrPattern) {
		this.shapeOrPattern = shapeOrPattern;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getMainMaterial() {
		return mainMaterial;
	}

	public void setMainMaterial(String mainMaterial) {
		this.mainMaterial = mainMaterial;
	}
	
	
	
}
