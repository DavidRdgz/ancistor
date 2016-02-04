myHtml = (tweet) ->
  """
  <div class = "panel panel-default">
     <div class = "panel-body">
        #{tweet}
     </div>

     <div class = "panel-footer"></div>
  </div>
  """



$ ->
  $.get "/messages", (messages) ->
    $.each messages, (index, message) ->
      $("#messages").append myHtml message.tweet