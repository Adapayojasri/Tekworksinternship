class todolistdata
  {
    String add;
        String edit;
        String delete;
    todolist(String add,String edit,String delete)
    {
    this.add=add;
      this.edit=edit;
      this.delete=delete;
  }
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public String getEdit() {
	return edit;
}
public void setEdit(String edit) {
	this.edit = edit;
}
public String getDelete() {
	return delete;
}
public void setDelete(String delete) {
	this.delete = delete;
}
