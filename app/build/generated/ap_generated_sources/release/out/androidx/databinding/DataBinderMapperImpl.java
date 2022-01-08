package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new te.app.aljoud.DataBinderMapperImpl());
  }
}
