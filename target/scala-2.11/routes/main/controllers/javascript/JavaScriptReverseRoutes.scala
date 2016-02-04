
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/galois/Desktop/activator-1.3.7-minimal/play-scala-portfolio/conf/routes
// @DATE:Thu Feb 04 10:46:59 PST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:17
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index2",
      """
        function(tag) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
        }
      """
    )
  
    // @LINE:10
    def getMessages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getMessages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messages"})
        }
      """
    )
  
    // @LINE:9
    def addMessage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addMessage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
    // @LINE:13
    def getHashtag: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getHashtag",
      """
        function(tag) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hashtag/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tag", encodeURIComponent(tag))})
        }
      """
    )
  
    // @LINE:12
    def getHashtags: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getHashtags",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hashtags"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}