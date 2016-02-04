
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/galois/Desktop/activator-1.3.7-minimal/play-scala-portfolio/conf/routes
// @DATE:Thu Feb 04 10:46:59 PST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:16
  Assets_1: controllers.Assets,
  // @LINE:17
  WebJarAssets_0: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:16
    Assets_1: controllers.Assets,
    // @LINE:17
    WebJarAssets_0: controllers.WebJarAssets
  ) = this(errorHandler, Application_2, Assets_1, WebJarAssets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Assets_1, WebJarAssets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tag/$tag<[^/]+>""", """controllers.Application.index2(tag:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.Application.addMessage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messages""", """controllers.Application.getMessages()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hashtags""", """controllers.Application.getHashtags()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hashtag/$tag<[^/]+>""", """controllers.Application.getHashtag(tag:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_index21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tag/"), DynamicPart("tag", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_index21_invoker = createInvoker(
    Application_2.index2(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index2",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """tag/$tag<[^/]+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_addMessage2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_Application_addMessage2_invoker = createInvoker(
    Application_2.addMessage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addMessage",
      Nil,
      "POST",
      """""",
      this.prefix + """message"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_getMessages3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messages")))
  )
  private[this] lazy val controllers_Application_getMessages3_invoker = createInvoker(
    Application_2.getMessages(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getMessages",
      Nil,
      "GET",
      """""",
      this.prefix + """messages"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_getHashtags4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hashtags")))
  )
  private[this] lazy val controllers_Application_getHashtags4_invoker = createInvoker(
    Application_2.getHashtags(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getHashtags",
      Nil,
      "GET",
      """""",
      this.prefix + """hashtags"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_getHashtag5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hashtag/"), DynamicPart("tag", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getHashtag5_invoker = createInvoker(
    Application_2.getHashtag(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getHashtag",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """hashtag/$tag<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_WebJarAssets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_versioned7_invoker = createInvoker(
    WebJarAssets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index)
      }
  
    // @LINE:7
    case controllers_Application_index21_route(params) =>
      call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_Application_index21_invoker.call(Application_2.index2(tag))
      }
  
    // @LINE:9
    case controllers_Application_addMessage2_route(params) =>
      call { 
        controllers_Application_addMessage2_invoker.call(Application_2.addMessage())
      }
  
    // @LINE:10
    case controllers_Application_getMessages3_route(params) =>
      call { 
        controllers_Application_getMessages3_invoker.call(Application_2.getMessages())
      }
  
    // @LINE:12
    case controllers_Application_getHashtags4_route(params) =>
      call { 
        controllers_Application_getHashtags4_invoker.call(Application_2.getHashtags())
      }
  
    // @LINE:13
    case controllers_Application_getHashtag5_route(params) =>
      call(params.fromPath[String]("tag", None)) { (tag) =>
        controllers_Application_getHashtag5_invoker.call(Application_2.getHashtag(tag))
      }
  
    // @LINE:16
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_WebJarAssets_versioned7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_WebJarAssets_versioned7_invoker.call(WebJarAssets_0.versioned(path, file))
      }
  }
}