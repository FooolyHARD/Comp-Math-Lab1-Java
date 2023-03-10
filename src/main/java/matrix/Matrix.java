package matrix;

import lombok.Data;

@Data
public class Matrix {
    Double[][] matrixValues;
    int columnSize;
    int rowSize;
    double epsilon;

    public Matrix getCopy(){
        Matrix newMatrix = new Matrix();
        Double[][] newMatrixValues = new Double[columnSize][rowSize];
        for (int i = 0; i<columnSize; i++){
            Double[] newMatrixRow = new Double[rowSize];
            System.arraycopy(matrixValues[i], 0, newMatrixRow, 0, rowSize);
            newMatrixValues[i] = newMatrixRow;
        }

        newMatrix.setMatrixValues(newMatrixValues);
        newMatrix.setEpsilon(epsilon);
        newMatrix.setColumnSize(columnSize);
        newMatrix.setRowSize(rowSize);

        return newMatrix;
    }

}
