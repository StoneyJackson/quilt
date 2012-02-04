# Quilt

  <em>Quilt is currently under development. All ideas expressed here are
  subject to change.</em>

## Overview

  Quilt allows web developers to stich together content from different
  sources into a pattern. A pattern is implemented in HTML and CSS and
  provides the basic layout for the final document. A Quilt document
  describes how to fetch content from different sources and how to
  inject it into the pattern.


### What Quilt isn't

  Quilt is not a web-application framework. It is more lightweight than
  a framework. It does not impose a particular programming language for
  your web-application. It does not help you manage the URLs for your
  server. It does not impose a particular design pattern.

  Quilt is not your typical templating engine. It uses CCS3-style selectors
  to specify where to insert content into a layout. The layout and content
  can come from other sources on the web.

### What Quilt is

  Quilt allows developers to further decuple their layouts from their
  content. This was the promise of CSS, but developers frequently still need
  to add div elements to their content to provide hooks for CSS styling.
  These divs usually have nothing to do with the structure of their content.
  They are their to help describe the layout of the page. With HTML5,
  developers now have header, footer, nav, aside, and article to mark up the
  structure of their layout. But it is still the layout, and not content.

  "Who cares if my layout is mixed in with my content?"
    
  Changing the layout for your site becomes more complicated if it is mixed
  up with your content. For example, let's say your site's layout is
  currently implemented using div elements. Now you want to use the new HTML5
  elements. Unless you are using a web-application framework that provides
  templating, or some custom built CGI-based framework, or a separate
  templating mechanism (like Quilt!), you'll be in the unenviable possition
  of trying to make a consistent change accross a large set of files.


### Related Technologies

* Deliverance: http://packages.python.org/Deliverance/
* Psttt!: http://codeassembly.com/Psttt!-I-am-a-different-php-templating-system/
* CSS layouts module: http://www.w3.org/TR/2009/WD-css3-layout-20090402/
* Mozzila Merge on Browse (MOB): http://sdpml.mozdev.org/
* HTML frames and iframe
* Frameworks like Ruby on Rails (http://rubyonrails.org/) and Yii (http://www.yiiframework.com/)
* CGI languages such as Perl (http://www.perl.org/), PHP (http://www.php.net/), and Python (http://python.org/)
* Templating engines such as Smarty (http://www.smarty.net/ ): http://en.wikipedia.org/wiki/Template_engine_(web)


## Other topics

  * Motivation

    * Presentation (style and layout) should be separate from content

      * Diagram

    * CSS separates style, not content

      * Example

    * Quilt separates layout

      * Or quilt separates content

  * Overview

    * Write a layout

    * Write a quilt to stitch content into layout

    * Example

  * Users

    * Website developers (primary)

    * Webserver administrators (secondary)

    * Web consumers (tertiary)

  * Requirements

    * Easy to learn

    * Easy to deploy

    * Easy to configure

    * Easy to maintain

    * Overlay seamlessly with existing technology

      * Browsers

      * Servers

      * Frameworks

      * Basic technology (html, css, http, javascript)

    * Provide added value to existing sites

    * High-performance

    * Common cases are easy

    * Rarer cases are possible

  * Design decisions

    * Where should stitching take place?

      * Client-side

      * Middle-side

      * Server-side

    * How specifically should it be implemented?

      * Client

        * Ajax

        * Browser plugin

      * Middle

        * Proxy server

      * Server

        * Server plugin/handler

        * CGI running on server

      * Compiled core implementation?

    * Syntax and semantics of Quilt (DSL: domain specific language)

      * Base languages: XML, JSON, or Custom

      * Capabilities

  * Open questions

    * How do we prevent infinite recursion caused by url() and cgi()?

      * Especially in the presence of an advisory

    * How do we generalize quilts so they can be reused?

    * If quilt hijacks requests, can quilt play nice with frameworks that also
like to hijack requests?

      * More generally: can two url hijacking frameworks coexist?



## Quilt Language

    I've come full circle. I've finally convinced myself that Quilt should run
    server-side. I really wanted it to run client-side with all the other cool
    kids: HTML, CSS, and JavaScript. But there are too many advantages to
    running server-side.

        * Server-side content can be loaded without making additional
          HTTP requests.

        * But if you want to load a page through HTTP, no problem.

        * You could also execute a command/script/program on the server
          for its output.

        * It could be implemented in a myriad of languages without a client's
          need to know.

    I want the Quilt syntax to be simple for and familiar to web developers.
    Traditional paths and URLs will be used to fetch content. CSS selectors
    will be used to cull fetched content and identify elements to be modified.
    About the only new syntax will be a set of operators for performing
    modifications.

    Below is a simple example that produces a web page based on base.html, but
    with a different title and content.

        file(../base.html) {

            title,#title{ = 'Quilt' }

            #content{ = '
              Quilt allows web developers to stich together content from
              different sources into pattern. Sources of content are fetched
              from the local file system or from the web. Patterns take the
              form of an HTML file that provides the basic frame and layout for
              the final document.
            ' }

        }

    The file() loader loads the given file from the local filesystem. Relative
    URLs are automatically resolved against the loaded page's location (or the
    URL specified in its base element, if given).

    The syntax of the statements inside the body of the loader are CSS-like.
    Each statement begins with a CSS-like selector followed by a body. The
    selector identifies elements within the document. The body describes how to
    modify the identified elements. The '=' operator sets the contents of the
    matched elements to the value of the expression that follows the operator.
    In the above example, the first statement sets the contents of the title
    element and the element whose ID is 'title' to 'Quilt'.

    Content can come from strings, as demonstrated above, or from loaders.  For
    example, if a file named content.txt contained the same text that was
    assigned to #content in the above example, then the above example could be
    rewritten as follows:

        file(../base.html) {

            title,#title{ = 'Quilt' }

            #content{ = file(content.txt) }

        }

    Loaders can be used to extract fragments from a larger document by using a
    CSS-like selector to select out the desired content. For example, if the
    desired content was the contents of the #content element inside
    content.html, we could extract it as follows.

        #content{ = file(content.html) #content::content{} }

    Notice that CSS-like selectors are always followed by a pair of open and
    close braces. Also notice that the pseudo-element ::content is not a
    standard CSS selector. It selects all the immediate child nodes, including
    comments and text nodes.

    There are several different operators for modifying content:

        = e   Set the contents of matches to e.
        < e   Prepend e to contents of matches.
        > e   Append e to contents of matches.
        == e  Replace matches with e.
        << e  Prepend e to contents of matches.
        >> e  Append e to contents of matches.

    You can modify the value of attributes. The example below changes the
    language for the document.

        file(../base.html) {
            html { @lang = 'fr' }
        }

    The prepend and append operators also work for attributes. You can remove
    an attribute using the <> operator.

        :checked {
            @checked <>
        }

    Multiple modifications can be made to the same set of matched elements by
    separating each modification expression with a semi-colon.

        textarea {
          @cols = '400px';
          @rows = '200px';
          = '[ Comment here. ]';
        }

    The semicolon after the last expression isn't necessary, but it doesn't
    hurt.

    There are several different loaders. Each provides different performance
    and features.

        file()    loads a file from the local filesystem. This is good for
                  static content. This loader likely provides the best
                  performance, but the least features.

        cmd()     executes a command on the local system. The command's output
                  provides the content. This is good for running specialized
                  processes to provide content. They might access a database
                  or other files on the local system, or they could make
                  requests to other systems. However, currenty, you cannot
                  pass parameters from the request to the command. Think
                  of the command as a way to build content from data on the
                  server. The performance of this loader depends on the
                  command being invoked. It is likely worse than the file
                  loader.

        url()     issues an HTTP request to retreive content. This is good
                  for loading content from another web server, or to leverage
                  the local web server to load dynamic files, such as PHP.
                  However, request parameters are not passed through to or
                  from the requested page.

        cgi()     issues an HTTP request with headers to retreive content.
                  This is good for invoking CGIs that require headers from
                  the client, or that need to set headers on the client.

### Grammar

    SELECTOR
    TEXT
    URL

    attr-exp: attr ( '<>'
                 | /[<>=]/ content )
    cont-exp: ( '<<' | '>>' | '==' | /[<>=]/ ) content
    exp: attr-exp | cont-exp
    exps: ( exp ( ';' exp )* ';'? )?
    loader: ('file' | 'cmd' | 'url' | 'cgi') '(' URL ')'
    content: (TEXT | loader) ( ( SELECTOR '{' exps '}' )
                       | ( '{' exps '}' )
                       )?
    quilt: content*


