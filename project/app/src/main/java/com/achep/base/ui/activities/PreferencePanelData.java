public class PreferencePanelData {
    private String fragmentClass;
    private Bundle arguments;
    private int titleResId;
    private CharSequence title;

    public PreferencePanelData(String fragmentClass, Bundle arguments, int titleResId, CharSequence title) {
        this.fragmentClass = fragmentClass;
        this.arguments = arguments;
        this.titleResId = titleResId;
        this.title = title;
    }

    public String getFragmentClass() {
        return fragmentClass;
    }

    public void setFragmentClass(String fragmentClass) {
        this.fragmentClass = fragmentClass;
    }

    public Bundle getArguments() {
        return arguments;
    }

    public void setArguments(Bundle arguments) {
        this.arguments = arguments;
    }

    public int getTitleResId() {
        return titleResId;
    }

    public void setTitleResId(int titleResId) {
        this.titleResId = titleResId;
    }

    public CharSequence getTitle() {
        return title;
    }

    public void setTitle(CharSequence title) {
        this.title = title;
    }
}
