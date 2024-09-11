package exercise;

// BEGIN
public class LabelTag implements TagInterface{
    private String tag;
    private TagInterface object;

    public LabelTag(String tag, TagInterface object){
        this.tag = tag;
        this.object = object;
    }
@Override
public String render(){
        return "<label>" + tag + object.render() + "</label>";
}
public void wrap() {
    TagInterface labelTag = new LabelTag(tag, object);
    labelTag.render();
}
}
// END
