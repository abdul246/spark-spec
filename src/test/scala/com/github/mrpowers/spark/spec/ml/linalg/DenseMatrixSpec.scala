package com.github.mrpowers.spark.spec.ml.linalg

import com.holdenkarau.spark.testing.DataFrameSuiteBase
import org.scalatest.FunSpec
import org.apache.spark.ml.linalg.DenseMatrix

class DenseMatrixSpec extends FunSpec with DataFrameSuiteBase {

  describe("new") {

    it("creates a DenseMatrix") {

      val m = new DenseMatrix(3, 2, Array(1.0, 3.0, 5.0, 2.0, 4.0, 6.0))
      assert(m.getClass().getName() === "org.apache.spark.ml.linalg.DenseMatrix")

    }

  }

  describe("#transpose") {

    it("transposes the matrix") {

      val m = new DenseMatrix(3, 2, Array(1.0, 3.0, 5.0, 2.0, 4.0, 6.0))
      val actual = m.transpose
      val expected = new DenseMatrix(2, 3, Array(1.0, 2.0, 3.0, 4.0, 5.0, 6.0))
      assert(actual === expected)

    }

  }

  describe("#copy") {

    it("copies the matrix") {

      val m = new DenseMatrix(4, 3, Array(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0))
      val actual = m.copy
      val expected = new DenseMatrix(4, 3, Array(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0))
      assert(actual === expected)

    }

  }

  describe("#apply") {

    it("gets the (i,j)th element of a matrix") {

    val m = new DenseMatrix(4, 3, Array(1.0, 3.0, 5.0, 2.0, 4.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0))
    val actual = m.apply(2,2)
    val expected = 11.0
    assert(actual === expected)

  }

}

}