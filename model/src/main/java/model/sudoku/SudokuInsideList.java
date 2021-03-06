package model.sudoku;



public class SudokuInsideList extends SudokuGroupBase {
  public SudokuInsideList() {
    super();
  }

  public final int set(final int x, final Integer value) {
    this.getSudokuFieldList().get(x).setFieldValue(value);
    return value;
  }

  public final int get(final int x) {
    return this.getSudokuFieldList().get(x).getFieldValue();
  }
}
