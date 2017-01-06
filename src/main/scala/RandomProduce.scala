/**
  * Created by Administrator on 2016/10/8.
  */

import java.util.Random

import org.apache.spark._

object RandomProduce {
  def main(args:Array[String]): Unit ={
    val conf=new SparkConf()
      .setMaster("local[8]")
      .setAppName("random shuffle")
      .set("spark.ui.port", "9995")
      .set("spark.driver.cores", "8")
      .set("spark.driver.memory", "4g")
     // .set("spark.executor.memory", "8g")
      //.set("spark.executor.num","8")
      .set("spark.rdd.compress", "true")

    val sc = new SparkContext(conf)

    val rand = new Random()

    val n = 10L
    val slices = 1
    val num = sc.parallelize(1L until  n, slices).map { i =>
      rand.nextInt(100)
    }.repartition(1).saveAsTextFile("D:\\shuffleNum")

    sc.stop()
  }
}
