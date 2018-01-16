package stackoverflow

import org.apache.spark.rdd.RDD

import stackoverflow.StackOverflow.{rawPostings, sc,euclideanDistance,converged,groupedPostings,scoredPostings,sampleVectors,vectorPostings,langs,findClosest,averageVectors}

import scala.annotation.tailrec


object test {

  def main(args: Array[String]): Unit = {


    val lines   = sc.textFile("src/main/scala/stackoverflow/stackoverflow.csv")
    val raw: RDD[Posting]    = rawPostings(lines)

    def langSpread = 50000
    /** K-means parameter: Number of clusters */
    def kmeansKernels = 45

    /** K-means parameter: Convergence criteria */
    def kmeansEta: Double = 20.0D

    /** K-means parameter: Maximum iterations */
    def kmeansMaxIterations = 120

    //val res = groupedPostings(raw)

    //val resScore = scoredPostings(res)

    //val resVetor = vectorPostings(resScore)

    //val resSample = sampleVectors(resVetor)

    //val clusters = resVetor.map(v => (findClosest(v, resSample), v)).groupByKey()

    /*
    val median = clusters.mapValues { vs =>

      val langLabel: String   = ??? // most common language in the cluster
    val langPercent: Double = ??? // percent of the questions in the most common language
    val clusterSize: Int    = vs.size
      val medianScore: Int    = ???

      (langLabel, langPercent, clusterSize, medianScore)
    }
    */

    //clusters.mapValues(l => l.toArray).foreach( l=> println(l))

    //val avg = clusters.map(x => (x._1, averageVectors(x._2))).collect()


    //resSample.foreach(l => println(l))

    //println("res :   "+resVetor.collect().length)
    //clusters.foreach(l => println(l))
    //println("res :   "+resSample.length)

    //avg.foreach(l => println(l))
    //println("avg size :"+avg.count())
  }
}
